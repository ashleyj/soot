/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.node;

import java.util.*;
import soot.jimple.parser.analysis.*;

public final class ALocalFieldRef extends PFieldRef
{
    private PLocalName _localName_;
    private TDot _dot_;
    private PFieldSignature _fieldSignature_;

    public ALocalFieldRef()
    {
    }

    public ALocalFieldRef(
        PLocalName _localName_,
        TDot _dot_,
        PFieldSignature _fieldSignature_)
    {
        setLocalName(_localName_);

        setDot(_dot_);

        setFieldSignature(_fieldSignature_);

    }
    public Object clone()
    {
        return new ALocalFieldRef(
            (PLocalName) cloneNode(_localName_),
            (TDot) cloneNode(_dot_),
            (PFieldSignature) cloneNode(_fieldSignature_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALocalFieldRef(this);
    }

    public PLocalName getLocalName()
    {
        return _localName_;
    }

    public void setLocalName(PLocalName node)
    {
        if(_localName_ != null)
        {
            _localName_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _localName_ = node;
    }

    public TDot getDot()
    {
        return _dot_;
    }

    public void setDot(TDot node)
    {
        if(_dot_ != null)
        {
            _dot_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _dot_ = node;
    }

    public PFieldSignature getFieldSignature()
    {
        return _fieldSignature_;
    }

    public void setFieldSignature(PFieldSignature node)
    {
        if(_fieldSignature_ != null)
        {
            _fieldSignature_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _fieldSignature_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_localName_)
            + toString(_dot_)
            + toString(_fieldSignature_);
    }

    void removeChild(Node child)
    {
        if(_localName_ == child)
        {
            _localName_ = null;
            return;
        }

        if(_dot_ == child)
        {
            _dot_ = null;
            return;
        }

        if(_fieldSignature_ == child)
        {
            _fieldSignature_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_localName_ == oldChild)
        {
            setLocalName((PLocalName) newChild);
            return;
        }

        if(_dot_ == oldChild)
        {
            setDot((TDot) newChild);
            return;
        }

        if(_fieldSignature_ == oldChild)
        {
            setFieldSignature((PFieldSignature) newChild);
            return;
        }

    }
}
